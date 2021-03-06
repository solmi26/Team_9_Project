package movie.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import movie.selectmovie.ImageSlide;
import movie.selectmovie.SelectMovieMain;
import pos.main.MainFrame;

public class MovieFrame1 extends JFrame{
   public static MovieFrame1 movieFrame;
   public MovieFrame1() {
	   String[] slide = {"./image/movie/아바타포스터1.jpg","./image/movie/위플래시포스터1.jpg","./image/movie/범죄도시2.jpg","./image/movie/거인포스터7.jpg","./image/movie/다크나이트5.jpg","./image/movie/다크나이트포스터3.jpg"};
      
      setBounds(0, 0, 700, 700);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      getContentPane().setLayout(null);

      JLabel adPanel = new ImageSlide(slide);
      getContentPane().add(adPanel);
      adPanel.setVisible(true);
      ImageSlide.tm.start();

      TopPanel titlePanel = new TopPanel();
      getContentPane().add(titlePanel);

      MidPanel midPanel = new MidPanel();
      getContentPane().add(midPanel);

      BtmPanel btmPanel = new BtmPanel();
      getContentPane().add(btmPanel);

      BtmbarPanel btmBarPanel = new BtmbarPanel();
      getContentPane().add(btmBarPanel);

      BtmPanel.btmBtn.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            dispose();
            SelectMovieMain.frame = new SelectMovieMain();
            SelectMovieMain.frame.setDefaultOptions();
         }
         
      });
      
      BtmbarPanel.goBackBtn.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            dispose();
            new MainFrame().setVisible(true);
         }
      });
      
      BtmbarPanel.homeBtn.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            dispose();
            new MainFrame().setVisible(true);
         }
      });
   }

   public static void main(String[] args) {
      MovieFrame1 abc = new MovieFrame1();
      abc.setVisible(true);
   }
}
