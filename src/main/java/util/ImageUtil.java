package main.java.util;

import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import java.io.*;

/**
 * 说明：由servlet调用，传入（文件流，要上传的路径，文件名）三个参数
 * 上传文件的servlet获取表单数据必须使用
 * for(FileItem item : list)方法
 *
 * @author student
 */

public class ImageUtil {
    public static String uploadImage(InputStream filestream, File savaPath, String filename) {
        //使用Apache文件上传组件处理文件上传步骤：
        //1、创建一个DiskFileItemFactory工厂
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        //解决上传文件名的中文乱码
        upload.setHeaderEncoding("UTF-8");
        //创建一个文件输出流
        //注意：不同的浏览器提交的文件名是不一样的，有些浏览器提交上来的文件名是带有路径的，如：  c:\a\b\1.txt，而有些只是单纯的文件名，如：1.txt
        //处理获取到的上传文件的文件名的路径部分，只保留文件名部分
        filename = filename.substring(filename.lastIndexOf("\\") + 1);
        String realSavePath = savaPath + "\\" + filename;
        //创建一个输出流
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(realSavePath);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //创建一个缓冲区
        byte buffer[] = new byte[1024];
        //判断输入流中的数据是否已经读完的标识
        int len = 0;
        //循环将输入流读入到缓冲区当中，(len=in.read(buffer))>0就表示in里面还有数据
        try {
            while ((len = filestream.read(buffer)) > 0) {
                //使用FileOutputStream输出流将缓冲区的数据写入到指定的目录(savePath + "\\" + filename)当中
                out.write(buffer, 0, len);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //关闭输入流
        try {
            filestream.close();
            out.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //关闭输出流
        //删除处理文件上传时生成的临时文件
        //item.delete();
        return realSavePath;
    }

    public static String identityImage(String filename) {
        String mName = null;
        try {
            /*下面这行String里的数组很关键，它有两个参数，都推荐使用绝对路径，
            第一个参数是你python编译器所在的位置，直接写python，系统会使用默认的python，
            第二个参数是你python文件所在的位置。
            */
            String[] arg = new String[]{"python",
                    "D:\\pycharm\\TraditionalChineseMedicine\\java_use_python.py", filename};
            Process pr = Runtime.getRuntime().exec(arg);
            BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream(), "gbk"));
            String line;
            while ((line = in.readLine()) != null) {
                mName = line;
            }
//                        req.setAttribute("mName", mName);
            in.close();
            pr.waitFor();
            InputStream errorStream = pr.getErrorStream();
            BufferedReader error = new BufferedReader(new InputStreamReader(errorStream, "gbk"));
            String lines = null;
            while ((lines = error.readLine()) != null) {
//                            req.setAttribute("error", lines);
            }
            error.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mName;
    }
}

