/* RadioDefault.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Thu Sep 6 2007, Created by Jeff.Liu
}}IS_NOTE

Copyright (C) 2007 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under GPL Version 2.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package org.zkoss.zul.render;

import java.io.IOException;
import java.io.Writer;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.render.ComponentRenderer;
import org.zkoss.zk.ui.render.WriterHelper;
import org.zkoss.zul.Radio;

/**
 * {@link Radio}'s default mold.
 * @author Jeff Liu
 * @since 3.0.0
 */
public class RadioDefault implements ComponentRenderer {
	public void render(Component comp, Writer out) throws IOException {
		final WriterHelper wh = new WriterHelper(out);
		final Radio self = (Radio)comp;
		final String uuid = self.getUuid();
		wh.write("<span id=\"").write(uuid).write("\" z.type=\"zul.widget.Radio\" ");
		wh.write(self.getOuterAttrs()).write(">").write("<input type=\"radio\" id=\""+uuid+"!real\"");
		wh.write(self.getInnerAttrs()).write("/>");
		wh.write("<label for=\""+uuid+"!real\"").write(self.getLabelAttrs()).write(">");
		wh.write(self.getImgTag()).write(self.getLabel()).writeln("</label>");
		if(self.getRadiogroup() != null
		&& self.getRadiogroup().getOrient().equals("vertical")) {
			wh.write("<br/>");
		}
		wh.writeln("</span>");
	}

}
