/*
 * Copyright 2017 eimapi.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.eimapi.store.components;

import io.github.eimapi.store.exception.ContentStoreException;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * Interface to provide the methods that anable the read and write operations
 * at the content
 *
 * @version 0.0.1
 * @since 0.0.1
 */
public interface ContentOperations {

    /**
     * write a {@link ByteArrayInputStream} at a content file
     *
     * @param baos - the ByteArrayOutputStream
     * @throws ContentStoreException - any exception
     */
    void write(ByteArrayOutputStream baos) throws ContentStoreException;

    /**
     * Read content and return their data in byte array input stream
     *
     * @return ByteArrayInputStream
     * @throws ContentStoreException - any exception
     */
    ByteArrayInputStream read() throws ContentStoreException;
}
