package program;

import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
public class Main {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                ImageFrame frame = new ImageFrame(args[0]);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

}
class ImageFrame extends JFrame
{
    public ImageFrame(String s)
    {
        setTitle("ImageTest");
        setSize(1200,800);

        ImageComponent component = new ImageComponent(s);
        add(component);
    }
}
class ImageComponent extends JComponent
{
    public ImageComponent(String s)
    {
        try
        {
            image = ImageIO.read(new File(s));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    public void paintComponent(Graphics g)
    {
        if(image == null) return;
        int imageWidth = image.getWidth(this);
        int imageHeight = image.getHeight(this);


        g.drawImage(image, 0, 0, null);

    }
    private Image image;
}

