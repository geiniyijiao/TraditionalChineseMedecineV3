package main.java.servlet;

import main.java.bean.MeType;
import main.java.bean.Medecine;
import main.java.service.MedecineService;
import main.java.service.MedecineTypeService;
import main.java.service.impl.MedecineServiceImpl;
import main.java.service.impl.MedecineTypeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(value = {"/detail.do", "/classes.do"})
public class MedecineServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    MedecineService ms = new MedecineServiceImpl();
    MedecineTypeService mts = new MedecineTypeServiceImpl();

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getRequestURI();
        path = path.substring(path.lastIndexOf("/") + 1, path.indexOf(".do"));
        int mTypeId = -1;
        String mId, file = null;
        if (path.equals("detail")) {
            Medecine medecine = new Medecine();
            mId = req.getParameter("mId");
            medecine = ms.findById(Integer.parseInt(mId));
            req.setAttribute("me", medecine);
            //管理员存放的数据库图片文件夹的绝对路径
            file = "D:/ideawork/TraditionalChineseMedecineV3/web/image/adminimage/" + medecine.getmName() + ".jpg";
            req.setAttribute("file", file);
            mTypeId = medecine.getmTypeId();
            req.setAttribute("mTypeName", mts.findById(mTypeId).getmTypeName());
            req.getRequestDispatcher("/detail.jsp").forward(req, resp);
        } else if (path.equals("classes")) {
            List<Medecine> mList = new ArrayList<Medecine>();
            List<MeType> mtList = new ArrayList<MeType>();
            MeType mt = new MeType();
            if (req.getParameter("mTypeId") == null) {
                mList = ms.findAll();
                mtList = mts.findAll();
                req.setAttribute("mList", mList);
                req.setAttribute("mtList", mtList);
                req.setAttribute("val", "mul");
            } else {
                mTypeId = Integer.parseInt(req.getParameter("mTypeId"));
                mt = mts.findById(mTypeId);
                req.setAttribute("mt", mt);
                mList = ms.findByTypeId(mTypeId);
                req.setAttribute("mList", mList);
            }
            req.getRequestDispatcher("/classes.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
