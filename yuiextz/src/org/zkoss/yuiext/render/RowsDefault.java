/* RowsDefault.java

 {{IS_NOTE
 Purpose:
 
 Description:
 
 History:
 Sep 14, 2007 11:24:54 AM , Created by jumperchen
 }}IS_NOTE

 Copyright (C) 2007 Potix Corporation. All Rights Reserved.

 {{IS_RIGHT
 This program is distributed under GPL Version 2.0 in the hope that
 it will be useful, but WITHOUT ANY WARRANTY.
 }}IS_RIGHT
 */
package org.zkoss.yuiext.render;

import java.io.IOException;
import java.io.Writer;

import org.zkoss.yuiext.grid.Rows;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.render.ComponentRenderer;
import org.zkoss.zk.ui.render.SmartWriter;

/**
 * {@link Rows}'s default mold.
 * 
 * @author jumperchen
 * @since ZK 3.0.0
 * 
 */
public class RowsDefault implements ComponentRenderer {

	public void render(Component comp, Writer out) throws IOException {
		final SmartWriter wh = new SmartWriter(out);
		final Rows self = (Rows) comp;
		wh.write("<tbody id=\"").write(self.getUuid()).write('"').write(self.getOuterAttrs())
			.write(self.getInnerAttrs()).write(">").writeChildren(self).writeln("</tbody>");
	}

}
