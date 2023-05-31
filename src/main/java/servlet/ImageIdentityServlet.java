package main.java.servlet;

import main.java.bean.Medecine;
import main.java.service.MedecineService;
import main.java.service.MedecineTypeService;
import main.java.service.impl.MedecineServiceImpl;
import main.java.service.impl.MedecineTypeServiceImpl;
import main.java.util.ImageUtil;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@WebServlet(value = {"/imgIdentity.do"})
public class ImageIdentityServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    MedecineService ms = new MedecineServiceImpl();
    MedecineTypeService mts = new MedecineTypeServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String path = req.getRequestURI();
        path = path.substring(path.lastIndexOf("/") + 1, path.indexOf(".do"));
        if (path.equals("imgIdentity")) {
            try {
                Medecine medecine = new Medecine();
                int mTypeId = -1;
                String filename = null;
                String mId = null;
                //保存新闻信息，读取二进制提交数据，需要建立工厂
                FileItemFactory factory = new DiskFileItemFactory();
                ServletFileUpload upload = new ServletFileUpload(factory);
                //设置二进制了读取
                upload.setHeaderEncoding("utf-8");
                upload.setFileSizeMax(1024 * 1024 * 5);
                List<FileItem> list = upload.parseRequest(req);
                for (FileItem fi : list) {
                    InputStream stream = fi.getInputStream();//上传文件需要的文件流参数
                    //获取到服务器真实路径
                    String url = req.getServletContext().getRealPath("upload");
                    //用户上传的图片保存的文件夹的绝对路径
                    File file = new File("D:\\ideawork\\TraditionalChineseMedecineV3\\web\\image\\useruploadimage");
                    filename = ImageUtil.uploadImage(stream, file, fi.getName());   //调用工具类方法
                    if (fi.getName() == null || fi.getName().trim().equals("")) {
                        //判空处理}
                        continue;
                    }
                    if (filename != null) {
                        mId = ImageUtil.identityImage(filename);
                        req.setAttribute("file", filename.replace("\\", "/"));
                    }
//                    req.setAttribute("mList", ms.findByName(mName));
                    medecine = ms.findById(Integer.parseInt(mId));
                    req.setAttribute("me", medecine);
                    mTypeId = medecine.getmTypeId();
                    req.setAttribute("mTypeName", mts.findById(mTypeId).getmTypeName());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            req.getRequestDispatcher("/detail.jsp").forward(req, resp);
//                resp.sendRedirect("detail.do?mName=" + mName + "?file=" + file);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
