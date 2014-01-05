package com.eric.app.dbmodel;

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * AppFeed entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.eric.app.dbmodel.AppFeed
 * @author MyEclipse Persistence Tools
 */
public class AppFeedDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(AppFeedDAO.class);
	// property constants
	public static final String TITLE = "title";
	public static final String CONTENT = "content";
	public static final String UID = "uid";
	public static final String PID = "pid";

	public void save(AppFeed transientInstance) {
		log.debug("saving AppFeed instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AppFeed persistentInstance) {
		log.debug("deleting AppFeed instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AppFeed findById(java.lang.Long id) {
		log.debug("getting AppFeed instance with id: " + id);
		try {
			AppFeed instance = (AppFeed) getSession().get(
					"com.eric.app.dbmodel.AppFeed", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AppFeed instance) {
		log.debug("finding AppFeed instance by example");
		try {
			List results = getSession()
					.createCriteria("com.eric.app.dbmodel.AppFeed")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding AppFeed instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AppFeed as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTitle(Object title) {
		return findByProperty(TITLE, title);
	}

	public List findByContent(Object content) {
		return findByProperty(CONTENT, content);
	}

	public List findByUid(Object uid) {
		return findByProperty(UID, uid);
	}

	public List findByPid(Object pid) {
		return findByProperty(PID, pid);
	}

	public List findAll() {
		log.debug("finding all AppFeed instances");
		try {
			String queryString = "from AppFeed";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AppFeed merge(AppFeed detachedInstance) {
		log.debug("merging AppFeed instance");
		try {
			AppFeed result = (AppFeed) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AppFeed instance) {
		log.debug("attaching dirty AppFeed instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AppFeed instance) {
		log.debug("attaching clean AppFeed instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}