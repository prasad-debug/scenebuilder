/*
 * Copyright (c) 2016, 2019, Gluon and/or its affiliates.
 * Copyright (c) 2012, 2014, Oracle and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 *
 * This file is available and licensed under the following license:
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  - Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  - Neither the name of Oracle Corporation nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.oracle.javafx.scenebuilder.kit.editor.panel.info;

import com.oracle.javafx.scenebuilder.kit.fxom.FXOMObject;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

/**
 *
 */
class RightCell extends TableCell<IndexEntry, FXOMObject> {
    
    
    /*
     * TableCell
     */

    @Override
    protected void updateItem(FXOMObject rightValue, boolean empty) {
        super.updateItem(rightValue, empty);
        
        final String text;
        if (empty) {
            text = ""; //NOI18N
        } else {
            if (rightValue == null) {
                text = "null"; //NOI18N
            } else {
                text = rightValue.getGlueElement().getTagName();
            }
        }
        setText(text);
    }
    
    
    
    
    public static class Factory 
    implements Callback<TableColumn<IndexEntry, FXOMObject>, TableCell<IndexEntry, FXOMObject>> {

        /*
         * Callback<TableView<IndexEntry>, TableCell<IndexEntry, FXOMObject>>
         */

        @Override
        public TableCell<IndexEntry, FXOMObject> call(TableColumn<IndexEntry, FXOMObject> tc) {
            return new RightCell();
        }
    }
}
