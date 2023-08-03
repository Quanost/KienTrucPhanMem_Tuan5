package org.example.GitSate;

public class GitContext {
    private GitState state;

    public GitContext() {
        state = null;
    }

    public void setState(GitState state) {
        this.state = state;
    }

    public GitState getState() {
        return state;
    }

    // Kiểm tra xem có thể commit hay không
    public boolean canCommit() {
        return state instanceof AddState;
    }

    // Kiểm tra xem có thể push hay không
    public boolean canPush() {
        return state instanceof CommitState;
    }
}
