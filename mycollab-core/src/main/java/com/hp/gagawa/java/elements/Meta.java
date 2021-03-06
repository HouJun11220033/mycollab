/**Generated by the Gagawa TagBuilder Fri Jan 30 21:29:45 PST 2009*/

/**
(c) Copyright 2008 Hewlett-Packard Development Company, L.P.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
*/

package com.hp.gagawa.java.elements;

import com.hp.gagawa.java.FertileNode;

import com.hp.gagawa.java.Node;
import com.hp.gagawa.java.elements.Text;
import java.util.List;

public class Meta extends FertileNode {

	public Meta(String content){
		super("meta");
		setContent(content);
	}


	public Meta setContent(String value){setAttribute("content", value); return this;}
	public String getContent(){return getAttribute("content");}
	public boolean removeContent(){return removeAttribute("content");}

	/**
	 * Appends a child node to the end of this element's DOM tree
	 * @param child node to be appended
	 * @return the node
	 */
	public Meta appendChild(Node child){
		if(this == child){
			throw new Error("Cannot append a node to itself.");
		}
		child.setParent(this);
		children.add(child);
		return this;
	}
	/**
	 * Appends a child node at the given index
	 * @param index insert point
	 * @param child node to be appended
	 * @return the node
	 */
	public Meta appendChild(int index, Node child){
		if(this == child){
			throw new Error("Cannot append a node to itself.");
		}
		child.setParent(this);
		children.add(index, child);
		return this;
	}
	/**
	 * Appends a list of children in the order given in the list
	 * @param children nodes to be appended
	 * @return the node
	 */
	public Meta appendChild(List<Node> children){
		if(children != null){
			for(Node child: children){
				appendChild(child);
			}
		}
		return this;
	}
	/**
	 * Appends the given children in the order given
	 * @param children nodes to be appended
	 * @return the node
	 */
	public Meta appendChild(Node... children){
		for(int i = 0; i < children.length; i++){
			appendChild(children[i]);
		}
		return this;
	}
	/**
	 * Convenience method which appends a text node to this element
	 * @param text the text to be appended
	 * @return the node
	 */
	public Meta appendText(String text){
		return appendChild(new Text(text));
	}
	/**
	 * Removes the child node
	 * @param child node to be removed
	 * @return the node
	 */
	public Meta removeChild(Node child){
		children.remove(child);
		return this;
	}
	/**
	 * Removes all child nodes
	 * @return the node
	 */
	public Meta removeChildren(){
		children.clear();
		return this;
	}
	public Meta setHttpEquiv(String value){setAttribute("http-equiv", value); return this;}
	public String getHttpEquiv(){return getAttribute("http-equiv");}
	public boolean removeHttpEquiv(){return removeAttribute("http-equiv");}

	public Meta setName(String value){setAttribute("name", value); return this;}
	public String getName(){return getAttribute("name");}
	public boolean removeName(){return removeAttribute("name");}

	public Meta setScheme(String value){setAttribute("scheme", value); return this;}
	public String getScheme(){return getAttribute("scheme");}
	public boolean removeScheme(){return removeAttribute("scheme");}

	public Meta setDir(String value){setAttribute("dir", value); return this;}
	public String getDir(){return getAttribute("dir");}
	public boolean removeDir(){return removeAttribute("dir");}

	public Meta setLang(String value){setAttribute("lang", value); return this;}
	public String getLang(){return getAttribute("lang");}
	public boolean removeLang(){return removeAttribute("lang");}

	public Meta setXMLLang(String value){setAttribute("xml:lang", value); return this;}
	public String getXMLLang(){return getAttribute("xml:lang");}
	public boolean removeXMLLang(){return removeAttribute("xml:lang");}

}
