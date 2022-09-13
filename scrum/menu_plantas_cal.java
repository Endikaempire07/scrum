package scrum;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class menu_plantas_cal extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4345818061198951232L;

	public menu_plantas_cal() {

        setTitle( "Plantas (Calefacciones)" );
        setSize( 400, 400 );
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        JTabbedPane menu = new JTabbedPane();

        // Tiene que ser final para que se pueda acceder desde el handler
        final JPanel p1 = new JPanel();
        final JPanel p2 = new JPanel();
        final JPanel p3 = new JPanel();
        
        p1.setLayout( new CardLayout() );
        p2.setLayout( new CardLayout() );
        p3.setLayout( new CardLayout() );

        menu.addTab( "Planta baja", p1 );
        menu.addTab( "1º planta", p2 );
        menu.addTab( "2º planta", p3);

        /*
        Panelimagen_planta_baja img = new Panelimagen_planta_baja();
		img.setBorder(new EmptyBorder(50, 50, 50, 50));
        p1.add(img);
        */
        
        prueba img = new prueba();
        img.doLayout();
        p1.add(img);
        
        Panelimagen_planta1 img1 = new Panelimagen_planta1();
		img1.setBorder(new EmptyBorder(50, 50, 50, 50));
        p2.add(img1);
        
        Panelimagen_planta2 img2 = new Panelimagen_planta2();
		img2.setBorder(new EmptyBorder(50, 50, 50, 50));
        p3.add(img2);
        
		add( menu, BorderLayout.CENTER );

        setVisible( true );

    }

    public static void main( String[] args ) {
        new menu_plantas_cal();
    }

}