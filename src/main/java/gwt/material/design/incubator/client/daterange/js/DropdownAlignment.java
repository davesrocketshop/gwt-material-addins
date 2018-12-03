package gwt.material.design.incubator.client.daterange.js;

import gwt.material.design.client.base.helper.EnumHelper;
import gwt.material.design.client.constants.CssType;

/**
 * @see {@link gwt.material.design.incubator.client.daterange.DateRangePicker#setDropdownAlignment(DropdownAlignment)}
 *
 * @author kevzlou7979
 */
public enum DropdownAlignment implements CssType {

    LEFT("left"),
    RIGHT("right"),
    CENTER("center");

    private final String cssClass;

    DropdownAlignment(final String cssClass) {
        this.cssClass = cssClass;
    }

    @Override
    public String getCssName() {
        return cssClass;
    }

    public static DropdownAlignment fromStyleName(final String styleName) {
        return EnumHelper.fromStyleName(styleName, DropdownAlignment.class, LEFT);
    }
}
