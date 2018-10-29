import org.junit.Test;

public class Main {

    @Test
    public void testHelloWrold() {
        System.out.println("HelloWorld!");
        System.out.println("修改和添加到本地仓库后 推送到github远程仓库中");
        System.out.println("clone下来的工程 可以直接push到远程仓库中相当于同步 不过要用https协议的才行");
    }
    public static void masterBranch(){
        System.out.println("master branch master分支中的内容更改");
    }
    public static void devBranch(){
        System.out.println("在dev分支中做的修改 修改后提交");
    }
}
