package org.bloomreach.forge.brut.common.repository;

import javax.jcr.RepositoryException;

import org.apache.jackrabbit.core.config.RepositoryConfig;
import org.hippoecm.repository.jackrabbit.RepositoryImpl;

class HippoRepository extends RepositoryImpl {
    HippoRepository(RepositoryConfig repConfig) throws RepositoryException {
        super(repConfig);
    }
}
