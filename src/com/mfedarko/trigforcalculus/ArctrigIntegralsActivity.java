/* Trig For Calculus: Reference App for Trigonometric Derivatives and Integrals
 * Copyright (C) 2013 Marcus Fedarko
 * Contact Email: marcus.fedarko@gmail.com
 * 
 * This file is part of Trig For Calculus.
 * 
 *    Trig For Calculus is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Trig For Calculus is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Trig For Calculus.  If not, see <http://www.gnu.org/licenses/>.
 *
 * The full text of the GNU General Public License version 3 can be found in the
 * source code root directory as COPYING.txt.
 */

package com.mfedarko.trigforcalculus;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class ArctrigIntegralsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_arctrig_integrals);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_arctrig_integrals, menu);
		return true;
	}

	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch(item.getItemId()) {
    	
    		case R.id.menu_about:
    			Intent i = new Intent(getApplicationContext(), AboutActivity.class);
    			startActivity(i);
    	    	return true;  	
    	    	
    	    default:
    	    	return super.onOptionsItemSelected(item);
    	}    	
    }

}
