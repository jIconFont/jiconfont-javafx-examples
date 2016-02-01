package jiconfont.javafx.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jiconfont.icons.FontAwesome;
import jiconfont.icons.GoogleMaterialDesignIcons;
import jiconfont.javafx.CatalogPaneFX;
import jiconfont.javafx.IconBuilderFX;

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
public class ShowCatalogFX extends Application {

  @Override
  public void start(Stage stage) {
    CatalogPaneFX catalogPaneFX = new CatalogPaneFX();
    for (FontAwesome icon : FontAwesome.values()) {
      catalogPaneFX.register(icon);
    }
    for (GoogleMaterialDesignIcons icon : GoogleMaterialDesignIcons.values()) {
      catalogPaneFX.register(icon);
    }
    catalogPaneFX.update();
    Scene scene = new Scene(catalogPaneFX, 950, 650);
    stage.setTitle("jIconFont - JavaFX - Catalog");
    stage.setScene(scene);
    stage.show();
    stage.centerOnScreen();

    IconBuilderFX.newIcon(FontAwesome.ALIGN_CENTER).buildImage();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
