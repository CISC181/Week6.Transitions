package application;
	
import javafx.animation.FadeTransition;
import javafx.animation.StrokeTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;


public class stroke extends Application {

  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
	  
	    Group group = new Group();
	    
	     Rectangle rect = new Rectangle (100, 40, 100, 100);
	     rect.setArcHeight(50);
	     rect.setArcWidth(50);
	     rect.setStrokeWidth(25);
	     rect.setFill(null);
	 
	     group.getChildren().add(rect);
	     
	     Scene scene = new Scene(group, 300, 200);
	     primaryStage.setScene(scene);
	     primaryStage.show();
	     
	     StrokeTransition st = new StrokeTransition(Duration.millis(1000), rect, Color.RED, Color.BLUE);
	     st.setCycleCount(4);
	     st.setAutoReverse(true);
	 
	     st.play();
  }
}
