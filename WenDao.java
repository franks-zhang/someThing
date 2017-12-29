import java.awt.Font;
import java.awt.Robot;
import java.awt.event.InputEvent;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class WenDao {

	public static void main(String[] args) {
		
		Robot r = null;
		try {
			
			// 设置按钮显示效果
			UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("微软雅黑", Font.PLAIN, 14)));
			// 设置文本显示效果
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("微软雅黑", Font.PLAIN, 16)));
			
			// 首先确认原始界面--正确
			int m = JOptionPane.showConfirmDialog(null, "确认已处于问道界面？ 否（退出程序）", "问道界面",JOptionPane.YES_NO_OPTION);
			if (m == JOptionPane.YES_OPTION) {  
				
				r = new Robot();
				String flag = "YES"; // 是否循环的标志
				int number = 0; // 网速快慢适应延迟
				
				int x = JOptionPane.showConfirmDialog(null, "电脑速度很快吗？ 否（鼠标反应延迟两秒）", "网速问题",JOptionPane.YES_NO_OPTION);
			    if (x == JOptionPane.NO_OPTION) {
			    	number = 2000; // 网速不好，鼠标移动前多休息两秒
			    }
				
				int n = JOptionPane.showConfirmDialog(null, "开始问道吗?", "开始问道",JOptionPane.YES_NO_OPTION);
				if (n == JOptionPane.YES_OPTION) {  
					
					while("YES".equals(flag)){
						
						// 问道轮次
						String str = JOptionPane.showInputDialog(null, "输入问道轮次（仅数字）","输入对话框", JOptionPane.PLAIN_MESSAGE);
						int b = Integer.parseInt(str);
						
						for(int a = 0; a < b; a++){
							
							r.delay(2000 + number);
							
						    r.mouseMove(123, 722);  // 一键拾取 
						    r.mousePress(InputEvent.BUTTON1_MASK);
						    r.mouseRelease(InputEvent.BUTTON1_MASK);
						    r.delay(100);
						    r.mousePress(InputEvent.BUTTON1_MASK);
						    r.mouseRelease(InputEvent.BUTTON1_MASK);
							
						    r.delay(2000 + number);
						    r.mouseMove(262, 722);  // 一键问道
						    r.mousePress(InputEvent.BUTTON1_MASK);
						    r.mouseRelease(InputEvent.BUTTON1_MASK);
						    r.delay(100);
						    r.mousePress(InputEvent.BUTTON1_MASK);
						    r.mouseRelease(InputEvent.BUTTON1_MASK);
						    
						    r.delay(2000 + number);
						    r.mouseMove(123, 722);  // 一键卖出
						    r.mousePress(InputEvent.BUTTON1_MASK);
						    r.mouseRelease(InputEvent.BUTTON1_MASK);
						    r.delay(100);
						    r.mousePress(InputEvent.BUTTON1_MASK);
						    r.mouseRelease(InputEvent.BUTTON1_MASK);
						    
						    r.delay(2000 + number);
						    r.mouseMove(262, 722);  // 一键问道 
						    r.mousePress(InputEvent.BUTTON1_MASK);
						    r.mouseRelease(InputEvent.BUTTON1_MASK);
						    r.delay(100);
						    r.mousePress(InputEvent.BUTTON1_MASK);
						    r.mouseRelease(InputEvent.BUTTON1_MASK);
						    
						    r.delay(2000 + number);
						    r.mouseMove(262, 722);  // 一键卖出
						    r.mousePress(InputEvent.BUTTON1_MASK);
						    r.mouseRelease(InputEvent.BUTTON1_MASK);
						    r.delay(100);
						    r.mousePress(InputEvent.BUTTON1_MASK);
						    r.mouseRelease(InputEvent.BUTTON1_MASK);
						    
						    r.delay(2000 + number);
						    r.mouseMove(123, 722);  // 道术背包
						    r.mousePress(InputEvent.BUTTON1_MASK);
						    r.mouseRelease(InputEvent.BUTTON1_MASK);
						    r.delay(100);
						    r.mousePress(InputEvent.BUTTON1_MASK);
						    r.mouseRelease(InputEvent.BUTTON1_MASK);
						    
						    r.delay(2000 + number);
						    r.mouseMove(262, 722);  // 合成道术
						    r.mousePress(InputEvent.BUTTON1_MASK);
						    r.mouseRelease(InputEvent.BUTTON1_MASK);
						    r.delay(100);
						    r.mousePress(InputEvent.BUTTON1_MASK);
						    r.mouseRelease(InputEvent.BUTTON1_MASK);
						    
						    r.delay(2000 + number);
						    r.mouseMove(123, 722);  // 确认
						    r.mousePress(InputEvent.BUTTON1_MASK);
						    r.mouseRelease(InputEvent.BUTTON1_MASK);
						    r.delay(100);
						    r.mousePress(InputEvent.BUTTON1_MASK);
						    r.mouseRelease(InputEvent.BUTTON1_MASK);
						    
						    r.delay(2000 + number);
						    r.mouseMove(262, 722);  // 修炼道术
						    r.mousePress(InputEvent.BUTTON1_MASK);
						    r.mouseRelease(InputEvent.BUTTON1_MASK);
						    r.delay(100);
						    r.mousePress(InputEvent.BUTTON1_MASK);
						    r.mouseRelease(InputEvent.BUTTON1_MASK);
						}
						
					    int j = JOptionPane.showConfirmDialog(null, "是否继续?", "继续问道",JOptionPane.YES_NO_OPTION);
					    if (j == JOptionPane.NO_OPTION) {
					    	flag = "NO";
					    }
					}
					
					JOptionPane.showMessageDialog(null, "问道结束");
				    
		        }  
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "问道程序错误！"+ e );
		}
		
	}
}
