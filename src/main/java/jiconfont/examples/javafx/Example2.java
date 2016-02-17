package jiconfont.examples.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import jiconfont.icons.FontAwesome;
import jiconfont.javafx.IconFontFX;
import jiconfont.javafx.IconNode;

/**
 * Copyright (c) 2016 jIconFont <BR>
 * <BR>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:<BR>
 * <BR>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.<BR>
 * <BR>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
public class Example2 extends Application {

    @Override
    public void start(Stage stage) {
        StackPane root = new StackPane();
        root.setBackground(new Background(new BackgroundFill(Color.WHITE, null, null)));
        StackPane iconPane = new StackPane();
        iconPane.setMaxWidth(Region.USE_PREF_SIZE);
        iconPane.setMaxHeight(Region.USE_PREF_SIZE);
        iconPane.setBackground(new Background(new BackgroundFill(Color.WHITE, null, null)));

        // Register the IconFont
        IconFontFX.register(FontAwesome.getIconFont());

        IconNode iconNode = new IconNode(FontAwesome.SMILE_O);
        iconNode.setIconSize(18);

        Label label = new Label("Hello!");
        label.setGraphic(iconNode);

        iconPane.getChildren().add(label);
        StackPane.setMargin(label, new Insets(5, 10, 5, 10));
        root.getChildren().add(iconPane);
        Scene scene = new Scene(root, 300, 300);
        stage.setTitle("jIconFont - JavaFX - Catalog");
        stage.setScene(scene);
        stage.show();
        stage.centerOnScreen();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
