package com.capitalone.dashboard.response;

import java.util.Set;

public class TestAutomationJobReviewResponse extends AuditReviewResponse {
	
	private Set<String> commitAuthors;
	
	private Set<String> jobConfigurationChangePerformers;

	public Set<String> getCommitAuthors() {
		return commitAuthors;
	}

	public void setCommitAuthors(Set<String> commitAuthors) {
		this.commitAuthors = commitAuthors;
	}

	public Set<String> getJobConfigurationChangePerformers() {
		return jobConfigurationChangePerformers;
	}

	public void setJobConfigurationChangePerformers(Set<String> jobConfigurationChangePerformers) {
		this.jobConfigurationChangePerformers = jobConfigurationChangePerformers;
	}

}
