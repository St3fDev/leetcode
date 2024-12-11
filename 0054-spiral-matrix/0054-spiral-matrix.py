class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        top = 0
        right = n - 1
        bottom = m - 1
        left = 0
        ans = []
        while top <= bottom and left <= right:
            for col in range(left, right + 1):
                ans.append(matrix[top][col])
            
            top+=1
            
            for row in range(top, bottom + 1):
                ans.append(matrix[row][right])
            
            right-=1
            
            if top <= bottom:
                for col in range(right, left - 1, -1):
                    ans.append(matrix[bottom][col])
                bottom -= 1

            if left <= right:
                for row in range(bottom, top - 1, -1):
                    ans.append(matrix[row][left])
                left += 1
            
        return ans