
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;

public class Ex8_12_UnderstandMusic extends Applet{

	private static final long serialVersionUID = 1L;
	JCheckBox box1, box2;
	JButton play, loop, stop;
	AudioClip audio1 = null;
	AudioClip audio2 = null;
	JLabel label = new JLabel();
	
	public void init (){
		resize(400, 200);
		this.setLayout(null);
		box1 = new JCheckBox("极乐净土");
		box2 = new JCheckBox("新自己");
		box1.setBounds(65, 12, 140, 35);
		box2.setBounds(200, 15, 180, 35);
		add(box1);
		add(box2);

		play = new JButton("Play");
		loop = new JButton("Loop");
		stop = new JButton("Stop");

		play.setBounds(50,65,80,30);
		loop.setBounds(150,65,80,30);
		stop.setBounds(250,65,80,30);
		stop.setEnabled(false);

		audio1 = getAudioClip(getCodeBase(),"jilejingtu.wav");
		audio2 = getAudioClip(getCodeBase(),"xinziji.wav");

		add(play);
		play.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				playActionPerformed(e);//这个函数应该是根据当时checkbox选择的情况来决定进行怎样的动作
			}
			
		});
		add(loop);
		loop.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				loopActionPerformed(e);
			}
			
		});
		add(stop);
		stop.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				stopActionPerformed(e);
			}
			
		});
		label = new JLabel("请选择歌曲后按键!");
		label.setBounds(65, 100, 400, 35);
		add(label);
	}
	private void playActionPerformed(ActionEvent e){
		if (audio1 != null && box1.isSelected()){
			audio1.play();
			play.setEnabled(false);
			loop.setEnabled(false);
			stop.setEnabled(true);
			label.setText("正在播放！");
		}else if (audio2 != null && box2.isSelected()){
			audio2.play();
			play.setEnabled(false);
			loop.setEnabled(false);
			stop.setEnabled(true);
			label.setText("正在播放！");
		}else{
			label.setText("请保证两文件存在！");
		}
	}
	private void loopActionPerformed(ActionEvent e){
		if (audio1 != null && box1.isSelected()){
			audio1.loop();
			play.setEnabled(false);
			loop.setEnabled(false);
			stop.setEnabled(true);
			label.setText("正在循环播放！");
		}else if (audio2 != null && box2.isSelected()){
			audio2.loop();
			play.setEnabled(false);
			loop.setEnabled(false);
			stop.setEnabled(true);
			label.setText("正在循环播放！");
		}else{
			label.setText("请保证两文件存在！");
		}
	}
	private void stopActionPerformed(ActionEvent e){
		audio1.stop();
		audio2.stop();
		play.setEnabled(true);
		loop.setEnabled(true);
		stop.setEnabled(false);
		label.setText("停止播放！");
	}
}
