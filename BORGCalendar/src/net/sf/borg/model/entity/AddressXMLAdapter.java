/*
 * This file is part of BORG.
 *
 * BORG is free software; you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 *
 * BORG is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * BORG; if not, write to the Free Software Foundation, Inc., 59 Temple Place,
 * Suite 330, Boston, MA 02111-1307 USA
 *
 * Copyright 2003 by Mike Berger
 */
package net.sf.borg.model.entity;

import net.sf.borg.common.XTree;
public class AddressXMLAdapter extends EntityXMLAdapter<Address> {

	public XTree toXml( Address o )
	{
		
		XTree xt = new XTree();
		xt.name("Address");
		xt.appendChild("KEY", Integer.toString(o.getKey()));
		if( o.getFirstName() != null && !o.getFirstName().equals(""))
			xt.appendChild("FirstName", o.getFirstName());
		if( o.getLastName() != null && !o.getLastName().equals(""))
			xt.appendChild("LastName", o.getLastName());
		if( o.getNickname() != null && !o.getNickname().equals(""))
			xt.appendChild("Nickname", o.getNickname());
		if( o.getEmail() != null && !o.getEmail().equals(""))
			xt.appendChild("Email", o.getEmail());
		if( o.getScreenName() != null && !o.getScreenName().equals(""))
			xt.appendChild("ScreenName", o.getScreenName());
		if( o.getWorkPhone() != null && !o.getWorkPhone().equals(""))
			xt.appendChild("WorkPhone", o.getWorkPhone());
		if( o.getHomePhone() != null && !o.getHomePhone().equals(""))
			xt.appendChild("HomePhone", o.getHomePhone());
		if( o.getFax() != null && !o.getFax().equals(""))
			xt.appendChild("Fax", o.getFax());
		if( o.getPager() != null && !o.getPager().equals(""))
			xt.appendChild("Pager", o.getPager());
		if( o.getStreetAddress() != null && !o.getStreetAddress().equals(""))
			xt.appendChild("StreetAddress", o.getStreetAddress());
		if( o.getCity() != null && !o.getCity().equals(""))
			xt.appendChild("City", o.getCity());
		if( o.getState() != null && !o.getState().equals(""))
			xt.appendChild("State", o.getState());
		if( o.getZip() != null && !o.getZip().equals(""))
			xt.appendChild("Zip", o.getZip());
		if( o.getCountry() != null && !o.getCountry().equals(""))
			xt.appendChild("Country", o.getCountry());
		if( o.getCompany() != null && !o.getCompany().equals(""))
			xt.appendChild("Company", o.getCompany());
		if( o.getWorkStreetAddress() != null && !o.getWorkStreetAddress().equals(""))
			xt.appendChild("WorkStreetAddress", o.getWorkStreetAddress());
		if( o.getWorkCity() != null && !o.getWorkCity().equals(""))
			xt.appendChild("WorkCity", o.getWorkCity());
		if( o.getWorkState() != null && !o.getWorkState().equals(""))
			xt.appendChild("WorkState", o.getWorkState());
		if( o.getWorkZip() != null && !o.getWorkZip().equals(""))
			xt.appendChild("WorkZip", o.getWorkZip());
		if( o.getWorkCountry() != null && !o.getWorkCountry().equals(""))
			xt.appendChild("WorkCountry", o.getWorkCountry());
		if( o.getWebPage() != null && !o.getWebPage().equals(""))
			xt.appendChild("WebPage", o.getWebPage());
		if( o.getNotes() != null && !o.getNotes().equals(""))
			xt.appendChild("Notes", o.getNotes());
		if( o.getBirthday() != null )
			xt.appendChild("Birthday", EntityXMLAdapter.toString(o.getBirthday()));
		if( o.getNew() == true )
			xt.appendChild("New" ,  EntityXMLAdapter.toString(o.getNew()));
		if( o.getModified() == true )
			xt.appendChild("Modified" ,  EntityXMLAdapter.toString(o.getModified()));
		if( o.getDeleted() == true )
			xt.appendChild("Deleted" ,  EntityXMLAdapter.toString(o.getDeleted()));
		return( xt );
	}

	public Address fromXml( XTree xt )
	{
		Address ret = new Address();
		String ks = xt.child("KEY").value();
		ret.setKey( EntityXMLAdapter.toInt(ks) );
		String val = "";
		val = xt.child("FirstName").value();
		if( !val.equals("") )
			ret.setFirstName( val );
		val = xt.child("LastName").value();
		if( !val.equals("") )
			ret.setLastName( val );
		val = xt.child("Nickname").value();
		if( !val.equals("") )
			ret.setNickname( val );
		val = xt.child("Email").value();
		if( !val.equals("") )
			ret.setEmail( val );
		val = xt.child("ScreenName").value();
		if( !val.equals("") )
			ret.setScreenName( val );
		val = xt.child("WorkPhone").value();
		if( !val.equals("") )
			ret.setWorkPhone( val );
		val = xt.child("HomePhone").value();
		if( !val.equals("") )
			ret.setHomePhone( val );
		val = xt.child("Fax").value();
		if( !val.equals("") )
			ret.setFax( val );
		val = xt.child("Pager").value();
		if( !val.equals("") )
			ret.setPager( val );
		val = xt.child("StreetAddress").value();
		if( !val.equals("") )
			ret.setStreetAddress( val );
		val = xt.child("City").value();
		if( !val.equals("") )
			ret.setCity( val );
		val = xt.child("State").value();
		if( !val.equals("") )
			ret.setState( val );
		val = xt.child("Zip").value();
		if( !val.equals("") )
			ret.setZip( val );
		val = xt.child("Country").value();
		if( !val.equals("") )
			ret.setCountry( val );
		val = xt.child("Company").value();
		if( !val.equals("") )
			ret.setCompany( val );
		val = xt.child("WorkStreetAddress").value();
		if( !val.equals("") )
			ret.setWorkStreetAddress( val );
		val = xt.child("WorkCity").value();
		if( !val.equals("") )
			ret.setWorkCity( val );
		val = xt.child("WorkState").value();
		if( !val.equals("") )
			ret.setWorkState( val );
		val = xt.child("WorkZip").value();
		if( !val.equals("") )
			ret.setWorkZip( val );
		val = xt.child("WorkCountry").value();
		if( !val.equals("") )
			ret.setWorkCountry( val );
		val = xt.child("WebPage").value();
		if( !val.equals("") )
			ret.setWebPage( val );
		val = xt.child("Notes").value();
		if( !val.equals("") )
			ret.setNotes( val );
		val = xt.child("Birthday").value();
		ret.setBirthday( EntityXMLAdapter.toDate(val) );
		val = xt.child("New").value();
		ret.setNew( EntityXMLAdapter.toBoolean(val) );
		val = xt.child("Modified").value();
		ret.setModified( EntityXMLAdapter.toBoolean(val) );
		val = xt.child("Deleted").value();
		ret.setDeleted( EntityXMLAdapter.toBoolean(val) );
		return( ret );
	}
}
