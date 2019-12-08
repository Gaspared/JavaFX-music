package test;

import java.nio.file.Paths;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class Main extends Application{

	public void start(Stage s) throws Exception {
		music();
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root,600,400);	
		Image img = new Image("file:/home/gspr/eclipse-workspace/test/pic.jpg");;
        ImageView imgView = new ImageView(img);
        root.getChildren().add(imgView);
		s.setScene(scene);
		s.setTitle("Playing music with JavaFX");
		s.show();
	}
	
	
	MediaPlayer mediaPlayer;
	public void music() {
		String s = "home.mp3";
		Media h = new Media(Paths.get(s).toUri().toString());
		mediaPlayer = new MediaPlayer(h);
		mediaPlayer.play();
		
	}
	
	public static void main (String[]args) {
		launch(args);
	}
	
	
}
