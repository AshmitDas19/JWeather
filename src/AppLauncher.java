import javax.swing.*;

public class AppLauncher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JWeatherGUI().setVisible(true);
//                System.out.println(JWeather.getLocationData("Tokyo"));
//                System.out.println(JWeather.getCurrentTime());
            }
        });
    }
}
