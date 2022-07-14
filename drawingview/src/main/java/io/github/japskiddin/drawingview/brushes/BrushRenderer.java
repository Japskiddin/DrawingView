package io.github.japskiddin.drawingview.brushes;

import android.graphics.Canvas;
import io.github.japskiddin.drawingview.DrawingEvent;

public interface BrushRenderer {
  void draw(Canvas canvas);

  void onTouch(DrawingEvent drawingEvent);

  void setBrush(Brush brush);
}
