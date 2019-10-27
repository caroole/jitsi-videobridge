/*
 * Copyright @ 2018 - present 8x8, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jitsi.videobridge.util;

import org.jitsi.osgi.*;
import org.osgi.framework.*;

/**
 * A generic class for providing an OSGI service based on a given
 * {@link BundleContext} and service class
 * @param <T> the service being provided
 */
public class OsgiServiceProvider<T>
{
    protected final BundleContext bundleContext;
    protected final Class<T> typeClass;

    public OsgiServiceProvider(BundleContext bundleContext, Class<T> typeClass)
    {
        this.bundleContext = bundleContext;
        this.typeClass = typeClass;
    }

    public T get()
    {
        return ServiceUtils2.getService(bundleContext, typeClass);
    }
}
