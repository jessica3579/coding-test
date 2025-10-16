class Solution {
	fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
		var answer: IntArray = intArrayOf()
		val score = HashMap<String, Int>()
        
		name.forEachIndexed { index, s ->
			score[s] = yearning[index]
		}

		photo.forEach { thisPhoto ->
			var thisPhotoScore = 0 
			thisPhoto.forEach { name ->
				thisPhotoScore += score[name] ?: 0
			}
			answer += thisPhotoScore
		}

		answer.forEach { result ->
			println("result :: [$result]")
		}
		return answer
	}
}