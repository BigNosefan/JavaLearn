
import java.io.*;
import java.util.Scanner;

public class Ex9_13_FileList {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("����·��:");
		String path = in.nextLine();
		File files = new File(path);
//		File newDir = new File(path);
//		newDir.mkdirs();
		System.out.println("��ǰĿ¼�ľ���·����:"+files.getAbsolutePath());
		fileList(files,1);
		in.close();
	}
	public static void fileList(File file, int level) {
		String preStr="";
		int dcount=0, fcount=0, tsize=0;
		for(int i=0; i<level; i++) {
			preStr += "\t";
		}
		File[] childs = file.listFiles();// ��ó���·����fileĿ¼�е��ļ�����Ŀ¼
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
			System.out.println(preStr+"��["+file.getName()+"]Ŀ¼����"+dcount+"��Ŀ¼,"+fcount+"���ļ�,��"+tsize+"�ֽڡ�");
	}

}
