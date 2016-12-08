
import java.io.*;
import java.util.Scanner;

public class Ex9_13_FileList {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("输入路径:");
		String path = in.nextLine();
		File files = new File(path);
//		File newDir = new File(path);
//		newDir.mkdirs();
		System.out.println("当前目录的绝对路径是:"+files.getAbsolutePath());
		fileList(files,1);
		in.close();
	}
	public static void fileList(File file, int level) {
		String preStr="";
		int dcount=0, fcount=0, tsize=0;
		for(int i=0; i<level; i++) {
			preStr += "\t";
		}
		File[] childs = file.listFiles();// 获得抽象路径名file目录中的文件或者目录
		for(int i=0; i<childs.length; i++) {
			if(childs[i].isDirectory()) {
				System.out.println(preStr + "[" + childs[i].getName() + "]");
				dcount++;
			} else {
				System.out.println(preStr + childs[i].getName());
				fcount++;
				tsize+=childs[i].length();
			}
			if(childs[i].isDirectory())
				fileList(childs[i],level+1);
		}
		if(file.isDirectory())
			System.out.println(preStr+"在["+file.getName()+"]目录下有"+dcount+"个目录,"+fcount+"个文件,共"+tsize+"字节。");
	}

}
