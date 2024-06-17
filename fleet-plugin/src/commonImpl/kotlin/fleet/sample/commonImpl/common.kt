// Remove safely if not needed, the whole `src/commonImpl` is for demo purposes
// if you don't need to declare anything shared between your frontend and workspace layers, remove the `src/commonImpl` directory
package fleet.sample.commonImpl

import fleet.kernel.SharedEntity

// TODO: this is an example shared entity, do not keep this code
interface Empty : SharedEntity {}
