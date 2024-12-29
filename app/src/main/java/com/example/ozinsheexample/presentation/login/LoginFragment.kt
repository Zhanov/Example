package com.example.ozinsheexample.presentation

import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ozinsheexample.R
import com.example.ozinsheexample.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.bntShowpassword.setOnClickListener {
            togglePasswordVisibility()
        }

        binding.bntLogin.setOnClickListener {
            validationEmail(emailValidation(binding.edittextEmail.text.toString()))
        }
    }

    // Visibility of Password
    fun togglePasswordVisibility() {
        val passwordEditText  = binding.edittextPassword
        passwordEditText.transformationMethod = if (passwordEditText.transformationMethod == HideReturnsTransformationMethod.getInstance()) {
            PasswordTransformationMethod.getInstance()
        } else {
            HideReturnsTransformationMethod.getInstance()
        }
    }

    val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
    fun emailValidation(email: String) : Boolean {
        return email.trim().matches(emailPattern.toRegex())
    }

    fun validationEmail(isValid: Boolean) {
        if (isValid) {
            binding.tvErrorTextEmail.text = ""
            binding.tvErrorTextEmail.visibility = View.GONE
            binding.tvErrorTextEmail.setBackgroundResource(R.drawable.background_edittext_focus_action_12dp)
        } else {
            binding.tvErrorTextEmail.text = "Қате формат"
            binding.tvErrorTextEmail.visibility = View.VISIBLE
            binding.edittextEmail.setBackgroundResource(R.drawable.background_edittext_12dp_error)
        }
    }

}