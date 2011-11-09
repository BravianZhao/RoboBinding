/**
 * AtClassLevel.java
 * Nov 2, 2011 Copyright Cheng Wei and Robert Taylor
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 */
package robobinding.notifypropertychange;

import java.beans.PropertyChangeSupport;

import robobinding.CustomSetter;
import robobinding.NotifyPropertyChange;

/**
 *
 * @since 1.0
 * @version $Revision: 1.0 $
 * @author Cheng Wei
 */
@NotifyPropertyChange
public class AtClassLevel
{
	private boolean property1;
	private String property2;
	private boolean customProperty;
	
	private PropertyChangeSupport propertyChangeSupport;
	public AtClassLevel()
	{
		propertyChangeSupport = new PropertyChangeSupport(this);
	}
	public boolean getProperty1()
	{
		return property1;
	}
	public void setProperty1(boolean newValue)
	{
		this.property1 = newValue;
	}
	
	public String getProperty2()
	{
		return property2;
	}
	public void setProperty2(String newValue)
	{
		this.property2 = newValue;
	}
	
	public void property2SetterInvoker()
	{
		//expect property2 property change notification to be sent?
		setProperty2("something new");
	}
	
	public boolean getCustomProperty()
	{
		return customProperty;
	}
	@CustomSetter
	public void setCustomProperty(boolean newValue)
	{
		boolean oldValue = getCustomProperty();
		customProperty = newValue;
		propertyChangeSupport.firePropertyChange("customProperty", oldValue, newValue);
	}
	
	public void setPropertyWithoutGetter(boolean b)
	{
		
	}
	
	public boolean getPropertyWithoutParameter()
	{
		return false;
	}
	public void setPropertyWithoutParameter()
	{
	}
	
	public void setMalformedProperty(boolean b1, boolean b2)
	{
	}
}