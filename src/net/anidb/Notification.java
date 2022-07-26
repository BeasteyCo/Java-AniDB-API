/*
 * Java AniDB API - A Java API for AniDB.net
 * (c) Copyright 2010 grizzlyxp
 * http://anidb.net/perl-bin/animedb.pl?show=userpage&uid=63935
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
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
package net.anidb;

/**
 * A single notification.
 * @author grizzlyxp
 * (http://anidb.net/perl-bin/animedb.pl?show=userpage&uid=63935)
 * @version <b>1.0</b>, 14.01.2010
 */
public abstract class Notification {
	/** The notification list entry. */
	private NotificationListEntry entry;
	
	/**
	 * Creates a notification.
	 * @param entry The notification list entry.
	 * @throws IllegalArgumentException If the notification list entry is
	 * <code>null</code>.
	 */
	public Notification(final NotificationListEntry entry) {
		super();
		if (entry == null) {
			throw new IllegalArgumentException("Argument entry is null.");
		}
		this.entry = entry;
	}
	
	/**
	 * Returns the notification list entry.
	 * @return The notification list entry.
	 */
	public NotificationListEntry getEntry() {
		return this.entry;
	}
	
	public int hashCode() {
		int result = 17;
		
		result = 37 * result + this.entry.hashCode();
		return result;
	}
	
	public boolean equals(final Object obj) {
		Notification notification;
		
		if (obj instanceof Notification) {
			notification = (Notification) obj;
			if (notification.entry.equals(this.entry)) {
				return true;
			}
		}
		return false;
	}
}
