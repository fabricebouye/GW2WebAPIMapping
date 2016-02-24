/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.core;

import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Stream;

/**
 * Defines a page result in a pageable request.
 * @author Fabrice Bouyé
 * @param <T> The type to use.
 */
public final class PageResult<T> implements Iterable<T> {

    private final Collection<T> delegated;
    private final int pageSize;
    private final int pageTotal;
    private final int resultTotal;

    /**
     * Creates a new instance.
     * @param collection The underlying value collection.
     * @param pageSize The default size of the page.
     * @param pageTotal The total number of page.
     * @param resultTotal The total number of results.
     */
    public PageResult(final Collection<T> collection, final int pageSize, final int pageTotal, final int resultTotal) {
        this.delegated = collection;
        this.pageSize = pageSize;
        this.pageTotal = pageTotal;
        this.resultTotal = resultTotal;
    }

    @Override
    public Iterator<T> iterator() {
        return delegated.iterator();
    }

    public Stream<T> stream() {
        return delegated.stream();
    }

    public Stream<T> parallelStream() {
        return delegated.parallelStream();
    }

    /**
     * Gets the default size of a page.
     * @return An int &ge; 0.
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Gets the total number of pages.
     * @return An int &ge; 0.
     */
    public int getPageTotal() {
        return pageTotal;
    }

    /**
     * Gets the size of this page.
     * @return An int &ge; 0.
     */
    public int getResultCount() {
        return delegated.size();
    }

    /**
     * Gets the total number of results.
     * @return An int &ge; 0.
     */
    public int getResultTotal() {
        return resultTotal;
    }
}
