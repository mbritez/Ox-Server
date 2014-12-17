package com.ox

class CommitStage extends Stage{
	
	String url
	String branch
	
	static belongsTo = [owner: Project]
	
	@Override
	String getType(){
		StageType.COMMIT_STAGE
	}
}
