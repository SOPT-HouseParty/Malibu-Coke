package com.my.study.ob_study_udacity

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.my.study.ob_study_udacity.databinding.FragmentGameWonBinding

class GameWonFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentGameWonBinding>(layoutInflater, R.layout.fragment_game_won, container, false)
        binding.nextMatchButton.setOnClickListener{
            it.findNavController().navigate(R.id.action_gameWonFragment_to_gameFragment)
        }
        var args = GameWonFragmentArgs.fromBundle(arguments?: error("GameWonFragment에 null 값이 넘어왔다."))
        Toast.makeText(requireContext(), "NumCorrect : ${args.numCorrect}, NumQuistion : ${args.numQuestions}", Toast.LENGTH_SHORT).show()

        //setHasOptionsMenu(true)
        return binding.root
    }

    /*override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        if(null == getShareIntet().resolveActivity(activity!!.packageManager)){
            menu?.findItem(R.id.share)?.setVisible(false)
        }
    }*/

    private fun getShareIntet() : Intent {
        var args = arguments?.let { GameWonFragmentArgs.fromBundle(it) }
        val shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent.setType("text/plain")
            .putExtra(Intent.EXTRA_TEXT, getString(R.string.share_success_text, args?.numCorrect, args?.numQuestions))
        return shareIntent
    }

    private fun shareSuccess(){
        startActivity(getShareIntet())
    }
}