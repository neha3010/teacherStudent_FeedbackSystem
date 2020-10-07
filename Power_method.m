%% Power method
% Dominant eigenvalue and its eigenvector
% Manoj K. Yadav
%%
A=input('Enter a square matrix :\n');
x0=input('Enter initial guess : \n');
tol=10^(-5);

x0=x0/norm(x0,inf);
x1=A*x0;
x1=x1/norm(x1,inf);
R_Q=(x1'*A*x1)/(x1'*x1); % Rayleigh Quotient
iter=0;

while (norm(A*x1-R_Q*x1,inf)>=tol && iter<=1000)
    x0=x1;
    x1=A*x1;
    x1=x1/norm(x1,inf);
    R_Q=(x1'*A*x1)/(x1'*x1);
    iter=iter+1;
    disp([x0 x1]); disp(R_Q);
end

disp('No. of iterations')
disp(iter)