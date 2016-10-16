/**
 * Primitive Collection Framework for Java
 * Copyright (C) 2010 Napile.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.napile.primitive;

import org.napile.primitive.lists.IntList;
import org.napile.primitive.lists.impl.ArrayIntList;

/**
 * @author: VISTALL
 * @date:  20:37/18.12.2010
 */
public class TestList
{
	public static void main(String... arg)
	{
		IntList list = new ArrayIntList();
		for(int i = 0; i < 500; i++)
			list.add(i);

		for(int i : list.toArray())
		{
			System.out.println(i);
		}

	}
}
