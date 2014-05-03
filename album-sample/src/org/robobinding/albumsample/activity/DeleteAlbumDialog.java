/**
 * Copyright 2011 Cheng Wei and Robert Taylor
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
package org.robobinding.albumsample.activity;

import org.robobinding.albumsample.R;
import org.robobinding.albumsample.model.Album;
import org.robobinding.albumsample.presentationmodel.DeleteAlbumDialogPresentationModel;
import org.robobinding.binder.Binders;

import android.app.Dialog;
import android.content.Context;

/**
 *
 * @since 1.0
 * @version $Revision: 1.0 $
 * @author Robert Taylor
 */
public class DeleteAlbumDialog extends Dialog {
	public DeleteAlbumDialog(Context context, Album album) {
		super(context);
		setCancelable(true);

		DeleteAlbumDialogPresentationModel deleteAlbumDialogPresentationModel = new DeleteAlbumDialogPresentationModel(
				this, album);
		Binders.bind(this, R.layout.delete_album_dialog,
				deleteAlbumDialogPresentationModel);
	}
}