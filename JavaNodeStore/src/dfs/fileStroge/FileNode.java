package dfs.fileStroge;

import java.io.File;

import dfs.utils.Config;

public class FileNode {

	//1.注册，向Server注册，Map，把信息传过去
	//名称，ip，端口，容量，实际容量，剩余容量，文件数量，是否可用等信息
	//2.保持和Server的联系
	//3.完成与Node文件上传，下载
	public  static void main(String[] args)
	{
		Config config=new Config(args[0]);
		System.out.println(config.getValue("NodeIP"));
		System.out.println(config.getValue("NodePort"));
		File file=new File("NodeRoot/Node1/storage1.properties");
		 
	}
}
