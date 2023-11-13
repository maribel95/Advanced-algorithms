package Model.Colors;

import Model.AbstractHSBColor;
import Model.HSBInterval;

public class Orange extends AbstractHSBColor {
    public Orange() {
        super(
                HSBInterval.H_RED_LIMIT,
                HSBInterval.H_ORANGE_LIMIT,
                HSBInterval.S_WHITE_LIMIT,
                HSBInterval.MAX_COLOR,
                HSBInterval.B_BLACK_LIMIT,
                HSBInterval.MAX_COLOR);
    }
}
