import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

public class L199_Binary_Tree_Right_Side_View {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        robot(root, ans, 0);
        return ans;
    }

    private void robot(TreeNode root, List<Integer> ans, int level) {
        if (root == null) {
            return;
        }
        if (ans.size() <= level) {
            ans.add(root.val);
        }
        ans.set(level, root.val);
        robot(root.left, ans, level + 1);
        robot(root.right, ans, level + 1);
    }

}
