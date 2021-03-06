package jiconfont.examples.javafx;

import java.io.InputStream;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import jiconfont.IconFont;
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
public class Example8 extends Application {

    @Override
    public void start(Stage stage) {
        StackPane root = new StackPane();
        root.setBackground(new Background(new BackgroundFill(Color.WHITE, null, null)));

        // Register my custom IconFont
        IconFontFX.register(new IconFont() {
            @Override
            public String getFontFamily() {
                return "Entypo";
            }

            @Override
            public InputStream getFontInputStream() {
                return Example8.class.getResourceAsStream("/entypo.ttf");
            }
        });

        IconNode iconNode = new IconNode();
        iconNode.getStyleClass().add("myCustomClass");

        root.getChildren().add(iconNode);
        Scene scene = new Scene(root, 300, 300);
        scene.getStylesheets().add("style.css");
        stage.setTitle("jIconFont - JavaFX - Catalog");
        stage.setScene(scene);
        stage.show();
        stage.centerOnScreen();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
