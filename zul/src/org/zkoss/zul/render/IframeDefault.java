/* IframeDefault.java

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
import org.zkoss.zul.Iframe;

/**
 * {@link Iframe}'s default mold.
 * @author Jeff Liu
 * @since 3.0.0
 */
public class IframeDefault implements ComponentRenderer {

	public void render(Component comp, Writer out) throws IOException {
		final WriterHelper wh = new WriterHelper(out);
		final Iframe self = (Iframe)comp;
		wh.write("<iframe id=\"").write(self.getUuid()).write("\" z.type=\"zul.widget.Ifr\" frameborder=\"0\"");
		wh.write(self.getOuterAttrs()).write(self.getInnerAttrs()).writeln(">");
		wh.writeln("</iframe>");
		
		//<iframe id="${self.uuid}" z.type="zul.widget.Ifr" frameborder="0"${self.outerAttrs}${self.innerAttrs}>
		//</iframe>

	}

}
