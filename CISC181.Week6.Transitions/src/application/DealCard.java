package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.PauseTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class DealCard extends Application {

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		Group root = new Group();
		Scene scene = new Scene(root, 600, 400);
		stage.setScene(scene);
		stage.setTitle("");

		Image image = new Image(getClass().getResourceAsStream("/img/b1fh.png"));
		
		ImageView imageView = new ImageView(image);
		imageView.setX(200f);
		imageView.setY(100f);

		PauseTransition pt = new PauseTransition(Duration.millis(1000));
		
		FadeTransition ft = new FadeTransition(Duration.millis(500));
		ft.setToValue(1.0f);
		ft.setFromValue(0.3f);
		ft.setAutoReverse(true);
		
		TranslateTransition tt = new TranslateTransition(Duration.millis(2250));
		//tt.setFromX(100f);
		tt.setToX(200f);
		//tt.setFromY(100f);
		tt.setToY(100f);
		tt.setAutoReverse(true);
		
		RotateTransition rt = new RotateTransition(Duration.millis(2500));
		rt.setByAngle(180f);
		rt.setCycleCount(1);
		//rt.setAutoReverse(true);
		
		ScaleTransition st = new ScaleTransition(Duration.millis(250));
		st.setByX(1.5f);
		st.setByY(1.5f);
		st.setAutoReverse(true);

		ParallelTransition parT = new ParallelTransition(rt,tt);
		
		SequentialTransition seqT = new SequentialTransition(imageView, pt, ft, parT, st);
		seqT.play();

		root.getChildren().add(imageView);

		stage.show();

	}

}
