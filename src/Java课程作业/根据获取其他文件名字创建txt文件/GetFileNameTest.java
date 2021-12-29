package Java课程作业.根据获取其他文件名字创建txt文件;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/11/13 7:28 下午
 */
public class GetFileNameTest {
    public static void main(String[] args) {
        // This is the path where the file's name you want to take.
        String path = "E:\\数据处理\\新的文件检核\\volume95";

        // The location where the newly created txt file is saved, use the end,
        // otherwise it may all be saved on the desktop
        GetFileName.setPath("E:\\数据处理\\新的文件检核\\95检验\\");
        GetFileName.getFile(path);
    }
}