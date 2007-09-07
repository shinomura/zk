/* AreaDefault.java

 {{IS_NOTE
 Purpose:
 
 Description:
 
 History:
 Sep 6, 2007 11:22:55 AM , Created by jumperchen
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
import org.zkoss.zul.Area;

/**
 * {@link Area}'s default mold.
 * 
 * @author jumperchen
 * @since 3.0.0
 * 
 */
public class AreaDefault implements ComponentRenderer {

	public void render(Component comp, Writer out) throws IOException {
		final WriterHelper wh = new WriterHelper(out);
		final Area self = (Area) comp;
		wh.write("<area id=\"").write(self.getUuid()).write(
				"\" z.type=\"Area\"").write(self.getOuterAttrs()).write("/>");
		wh.writeln();
	}

}
