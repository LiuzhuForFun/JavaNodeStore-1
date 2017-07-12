package dfs.fileServer;

import dfs.utils.Config;

public class FileServer {
	public static void main(String[]args)
	{
		//创建多个线程，执行不同的任务，线程均为死循环
		new Thread(){
			//文件操作，返回uuid，或返回文件所在node的ip，port
			public void run()
			{
				new Opserver(Integer.parseInt(new Config().getValue("FileServer.properties", "port")), 
						new FileopProtocol());
			}
		}.start();
		new Thread(){
			//和strogeNOde的通信，通知注册node
			
		}.start();
	}
	
}
