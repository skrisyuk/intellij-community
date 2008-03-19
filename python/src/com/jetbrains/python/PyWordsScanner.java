/*
 *  Copyright 2005 Pythonid Project
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS"; BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.jetbrains.python;

import com.intellij.lang.cacheBuilder.DefaultWordsScanner;
import com.intellij.psi.tree.TokenSet;
import com.jetbrains.python.lexer.PythonLexer;

/**
 * Created by IntelliJ IDEA.
 * User: yole
 * Date: 19.06.2005
 * Time: 14:20:06
 * To change this template use File | Settings | File Templates.
 */
public class PyWordsScanner extends DefaultWordsScanner {
    public PyWordsScanner() {
        super(new PythonLexer(),
                TokenSet.create(PyTokenTypes.IDENTIFIER),
                TokenSet.create(PyTokenTypes.END_OF_LINE_COMMENT),
                TokenSet.create(PyTokenTypes.STRING_LITERAL));
    }
}
