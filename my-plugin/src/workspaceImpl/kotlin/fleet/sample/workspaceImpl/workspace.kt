// this can be remove safely, the whole `src/workspaceImpl` is for demo purposes
// if you don't need to declare anything on the workspace side, remove the `src/workspaceImpl` directory
package fleet.sample.workspaceImpl

import com.jetbrains.rhizomedb.Entrypoint
import fleet.kernel.ChangeScope

@Entrypoint
fun ChangeScope.entrypoint() {
    // register workspace-related things here
}
