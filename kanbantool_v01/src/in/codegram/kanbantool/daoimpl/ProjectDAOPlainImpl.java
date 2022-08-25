package in.codegram.kanbantool.daoimpl;

import java.util.List;
import java.util.ArrayList;

import in.codegram.kanbantool.dao.ProjectDAO;
import in.codegram.kanbantool.exception.ProjectNotFoundException;
import in.codegram.kanbantool.modal.Project;


/**
 * This is ProjectDAOPlainImpl is for showing the basic CRUD functionality on List Collection
 * @author ranjeet
 *
 */
public class ProjectDAOPlainImpl implements ProjectDAO {
	
	List<Project> localRepository;
	
	public ProjectDAOPlainImpl() {
		localRepository = new ArrayList<>();
	}

	@Override
	public void save(Project project) {
		localRepository.add(project);

	}

	@Override
	public void update(Integer id, String projectDescription) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Project> list() {
		return localRepository;
	}

	@Override
	public void delete(Integer id) throws ProjectNotFoundException {
		// TODO Auto-generated method stub
		// loop through the localRepository
		// if id matches then take out the object and break the loop
		// otherwise, throw ProjectNotFoundException
		
		boolean isFound = false;
		for(Project project: localRepository) {
			if(project.getId().equals(id)) {
				isFound = true;
				localRepository.remove(project);
				break;
			}else {
				isFound = false;
			}
		}
		if(!isFound) {
			throw new ProjectNotFoundException("Project Not found with : " +id);
		}
		
	}
}
