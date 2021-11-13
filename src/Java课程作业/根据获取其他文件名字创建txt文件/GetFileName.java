package Java课程作业.根据获取其他文件名字创建txt文件;

import java.io.File;
import java.io.IOException;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/11/13 7:06 下午
 */
public class GetFileName {
    private static String path;

    public static String getPath() {
        return path;
    }

    public static void setPath(String path) {
        GetFileName.path = path;
    }

    // 用作临时的保存文件的名字，用作后面用来创建新的文件的名字
    private static String filenameTemp;

    /**
     * @param path 需要获取的文件名称所在的文件夹的绝对路径
     */
    public static void getFile(String path) {
        // get file list where the path has
        File file = new File(path);
        // get the folder list
        File[] array = file.listFiles();

        for (int i = 0; i < array.length; i++) {
            if (array[i].isFile()) {
                filenameTemp = array[i].getName().substring(0, array[i].getName().lastIndexOf("."));
                System.out.println(filenameTemp);

                try {
                    creatTxtFile(filenameTemp);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else if (array[i].isDirectory()) {
                getFile(array[i].getPath());
            }
        }
    }

    /**
     * 进行 txt 文件的创建
     * @param name  任意一个除去后缀的文件名字
     * @return
     * @throws IOException  输入输出报的异常，可能创建文件失败
     */
    public static boolean creatTxtFile(String name) throws IOException {
        boolean flag = false;
        filenameTemp = path + name + ".txt";
        File filename = new File(filenameTemp);
        if (!filename.exists()) {
            filename.createNewFile();
            flag = true;
        }
        return flag;
    }
}